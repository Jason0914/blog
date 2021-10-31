package cn.tycoding.biz.mapper;

import cn.tycoding.biz.entity.SysArticle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


public interface ArticleMapper extends BaseMapper<SysArticle> {

    List<SysArticle> findByCategory(Long id);

    List<SysArticle> findByTag(Long id);
}
