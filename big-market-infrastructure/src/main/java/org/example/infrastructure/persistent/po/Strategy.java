package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

@Data
public class Strategy {
    //自增ID
    private long id;
    //抽奖策略ID
    private long strategyId;
    //抽奖策略描述
    private String strategyDesc;
    private Date createTime;
    private Date updateTime;

}
