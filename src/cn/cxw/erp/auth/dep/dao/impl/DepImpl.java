package cn.cxw.erp.auth.dep.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.cxw.erp.auth.dep.dao.dao.DepDao;
import cn.cxw.erp.auth.dep.vo.DepModel;
import cn.cxw.erp.auth.dep.vo.DepQueryModel;
import cn.cxw.erp.util.base.BaseImpl;
import cn.cxw.erp.util.base.BaseQueryModel;

public class DepImpl extends BaseImpl<DepModel> implements DepDao{

	public void doQbc(DetachedCriteria dc,BaseQueryModel qm){
		DepQueryModel dqm = (DepQueryModel)qm;
		if(dqm.getName()!=null && dqm.getName().trim().length() > 0 ){
			dc.add(Restrictions.like("name", "%"+dqm.getName().trim()+"%"));
		}
		if(dqm.getTele()!=null && dqm.getTele().trim().length() > 0 ){
			dc.add(Restrictions.like("tele", "%"+dqm.getTele().trim()+"%"));
		}
	}
	
}






