package com.iot.game.pooh.web.rpc.interfaces;


public interface LotteryWebRpcService {

	/**
	 * 投注开始(START)
	 */
	String startLottery(String roomId,String userId,String guessType);

	/**
	 * 投注结束(CATCH)
	 */
	String endLottery(String roomId);

	/**
	 * 开奖(FREE)
	 */
	String drawLottery(String roomId);
}
