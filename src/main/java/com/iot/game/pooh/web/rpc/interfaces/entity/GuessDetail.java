package com.iot.game.pooh.web.rpc.interfaces.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 竞猜游戏实体类
 */
@Data
public class GuessDetail implements Serializable{
    private Integer guessId;
    private String appUserId;
    private String dollId;
    private String guessType;//最终竞猜结果
    private String guessKey;//1中 0不中
    private Integer guessGold;
    private String createDate;
    private String playbackId;
    private String settlementFlag;//Y 清算 N 未清算
    private String settlementDate;

    public GuessDetail(){

    }

    public GuessDetail(String appUserId, String dollId, String guessKey, Integer guessGold, String playbackId) {
        this.appUserId = appUserId;
        this.dollId = dollId;
        this.guessKey = guessKey;
        this.guessGold = guessGold;
        this.playbackId = playbackId;
    }

    public GuessDetail(String guessKey, String playbackId) {
        this.guessKey = guessKey;
        this.playbackId = playbackId;
    }
}
