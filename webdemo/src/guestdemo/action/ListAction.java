package guestdemo.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestdemo.dao.BoardDAO;
import guestdemo.dto.BoardDTO;
import guestdemo.dto.PageDTO;

public class ListAction {

	public void execute(HttpServletRequest req, HttpServletResponse resp){
		String pageNum=req.getParameter("pageNum");
		if(pageNum==null || pageNum.equals("null")){
			pageNum="1";
		}
		
		int currentPage=Integer.parseInt(pageNum);
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int cnt = dao.rowTotalCount();
		if(cnt>0){
		PageDTO pdto=new PageDTO(currentPage,cnt);
		List<BoardDTO> aList = dao.listMethod(pdto);
		req.setAttribute("aList", aList);
		req.setAttribute("pdto", pdto);
		}
	}//end execute()
	
	
}//end class
