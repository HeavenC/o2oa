package com.x.attendance.assemble.control.jaxrs.attendancestatistic;

import java.util.List;

import com.x.base.core.exception.PromptException;

class PersonStatisticForMonthListByDepartmentsException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public PersonStatisticForMonthListByDepartmentsException(Exception e, List<String> name, String year, String month) {
		super("系统根据部门名称列表，年份和月份查询个人统计数据信息ID列表时发生异常.Name:"+name+", Year:"+year+", Month:" + month, e );
	}
}