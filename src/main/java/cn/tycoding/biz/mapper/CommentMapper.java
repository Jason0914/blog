package cn.tycoding.biz.mapper;

import cn.tycoding.biz.entity.SysComment;
import cn.tycoding.common.utils.SplineChart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface CommentMapper extends BaseMapper<SysComment> {

    @Select("select date_format(create_time, '%Y-%m-%d') time, count(*) num from tb_comment group by date_format(create_time, '%Y-%m-%d')")
    List<SplineChart> chart();
}
