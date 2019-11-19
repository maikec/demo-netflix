package com.example.demofeign.controller;
/**
 * 公司名称
 * <p>
 * 本源代码由《demo-netflix》及其作者共同所有，未经版权持有者的事先书面授权，
 * 不得使用、复制、修改、合并、发布、分发和/或销售本源代码的副本。
 *
 * @copyright Copyright (c) 2019-2019+3. （company）all rights reserved.
 */

import com.example.demofeign.feign.DemoClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 说明
 *  @author maikec
 *  @date 2019/11/19
 */
@RestController
class DemoController{
    @Resource
    private DemoClient demoClient;
    @GetMapping("/{name}")
    public String echo(@PathVariable String name){
        return demoClient.echo(name);
    }
}
