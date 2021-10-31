package cn.tycoding.biz.mapper;

import cn.tycoding.biz.entity.SysArticleTag;
import cn.tycoding.biz.entity.SysTag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


public interface ArticleTagMapper extends BaseMapper<SysArticleTag> {

    List<SysTag> findByArticleId(long articleId);
}
