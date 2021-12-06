package com.femc.wzh.cms.dao;

import com.femc.wzh.common.entity.PageModel;
import java.util.List;
import java.util.Map;

import com.femc.wzh.cms.entity.Article;
import com.femc.wzh.cms.dto.ArticleQueryDTO;
import com.femc.wzh.cms.dto.CurrentArticleInfoDTO;
/**
 * @author xujianfang
 * @desc ArticleDaoCustom接口 
 * @date 2017-03-16
 */
public interface ArticleDaoCustom {

      PageModel<Article> queryArticlePage(ArticleQueryDTO articleQueryDTO);

      List<Article> queryArticleList(ArticleQueryDTO articleQueryDTO);

      List<Map<String, Object>> queryStatisMapList(ArticleQueryDTO articleQueryDTO);
      
      List<Article> queryNextArticleList(CurrentArticleInfoDTO currentArticleInfoDTO);
      
      List<Article> queryPreArticleList(CurrentArticleInfoDTO currentArticleInfoDTO);

}