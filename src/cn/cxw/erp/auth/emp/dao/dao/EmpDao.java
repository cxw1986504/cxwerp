package cn.cxw.erp.auth.emp.dao.dao;

import cn.cxw.erp.auth.emp.vo.EmpModel;

public interface EmpDao {

	public EmpModel getByUserNameAndPwd(String userName, String pwd);

}
