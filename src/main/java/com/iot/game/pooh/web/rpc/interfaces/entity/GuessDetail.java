package com.iot.game.pooh.web.rpc.interfaces.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 竞猜游戏实体类
 */
@Data
public class GuessDetail implements Serializable{
    private String nickname;//昵称
    private String appUserId;//用户ID

    public GuessDetail(){

    }

}
