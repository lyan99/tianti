package com.femc.wzh.cms.dao;

import com.femc.wzh.common.entity.PageModel;
import java.util.List;
import com.femc.wzh.cms.entity.ColumnInfo;
import com.femc.wzh.cms.dto.ColumnInfoQueryDTO;
/**
 * @author xujianfang
 * @desc ColumnInfoDaoCustom接口 
 * @date 2017-03-16
 */
public interface ColumnInfoDaoCustom {

      PageModel<ColumnInfo> queryColumnInfoPage(ColumnInfoQueryDTO columnInfoQueryDTO);

      List<ColumnInfo> queryColumnInfoList(ColumnInfoQueryDTO columnInfoQueryDTO);



}