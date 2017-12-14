package com.iot.game.pooh.web.rpc.interfaces;


import com.iot.game.pooh.server.entity.json.enums.PoohAbnormalStatus;
import com.iot.game.pooh.server.entity.json.enums.PoohNormalStatus;
import com.iot.game.pooh.server.entity.rpc.RpcCommandResult;

public interface LotteryWebRpcService {

	/**
	 * 投注开始(START)
	 */
	RpcCommandResult startLottery(String roomId, String userName);

	/**
	 * 投注结束(CATCH)
	 */
	RpcCommandResult endLottery(String roomId, String userName);

	/**
	 * 开奖(FREE)
	 *
	 * @param gifinumber 抓中返回1 没抓中返回0
	 */
	RpcCommandResult drawLottery(String roomId, Integer gifinumber);

	/**
	 * 异常通知
	 */
	String gatewayException(String roomId,PoohNormalStatus poohNormalStatus, PoohAbnormalStatus poohAbnormalStatus);
}

