package lachata.spring.jj.dept_service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.action.dept_action.Action;
import dept.dao.dept_dao.Dept_DAO;
import dept.model.dept_model.ActionCommand;

public class Dept_update_deptupdate implements Action{

	@Override
	public ActionCommand execute(HttpServletRequest request, HttpServletResponse respson) {
		
		// ? ?? λΆ?? ??΄λΈμ ?΄?©? send.jsp?? κ°????΄
				int deptno = Integer.parseInt(request.getParameter("deptno"));
				String dname = request.getParameter("dname");
				String loc = request.getParameter("loc");
				aaaaaDAO dept_DAO = new aaaaaDAO();
				//? ?? λΆ??? ? λ³΄λ?? ?? ?¨
				int count = dept_DAO.update(deptno, dname, loc);
				//λΆ?? ? λ³? ??  κ²°κ³Όλ₯? viewλ‘? λ³΄μ¬μ€?
				
				ActionCommand actionCommand = new ActionCommand();
				actionCommand.setRedirect(true);
				actionCommand.setPath("./Updatedata/view.jsp?cnt=" + count);
				
				return actionCommand;
	}

}
