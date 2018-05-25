package com.xiaoshabao.base.mybatis;

import org.mybatis.spring.annotation.MapperScan;

import com.xiaoshabao.base.BaseApplication;

@MapperScan(basePackages="com.xiaoshabao.**.mapper")
public class BaseMybatisApplicaiton extends BaseApplication {

}
