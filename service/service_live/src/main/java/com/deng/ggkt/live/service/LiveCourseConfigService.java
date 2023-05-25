package com.deng.ggkt.live.service;

import com.deng.ggkt.model.live.LiveCourseConfig;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 直播课程配置表 服务类
 * </p>
 *
 * @author deng
 * @since 2022-05-09
 */
public interface LiveCourseConfigService extends IService<LiveCourseConfig> {

    //根据课程id查询配置信息
    LiveCourseConfig getCourseConfigCourseId(Long id);
}
