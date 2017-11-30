package cn.cxw.erp.auth.dep.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.cxw.erp.auth.dep.business.ebi.DepEbi;
import cn.cxw.erp.auth.dep.dao.dao.DepDao;
import cn.cxw.erp.auth.dep.vo.DepModel;
import cn.cxw.erp.util.base.BaseQueryModel;

public class DepEbo implements DepEbi{
	private DepDao depDao;
	public void setDepDao(DepDao depDao) {
		this.depDao = depDao;
	}

	public void save(DepModel dm) {
		depDao.save(dm);
	}

	public List<DepModel> getAll() {
		return depDao.getAll();
	}

	public DepModel get(Serializable uuid) {
		return depDao.get(uuid);
	}

	public void update(DepModel dm) {
		depDao.update(dm);
	}

	public void delete(DepModel dm) {
		depDao.delete(dm);
	}

	public List<DepModel> getAll(BaseQueryModel qm, Integer pageNum,
			Integer pageCount) {
		return depDao.getAll(qm,pageNum,pageCount);
	}

	public Integer getCount(BaseQueryModel qm) {
		return depDao.getCount(qm);
	}

}
