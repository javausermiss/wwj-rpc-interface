package com.iot.game.pooh.web.rpc.interfaces;

import com.iot.game.pooh.server.rpc.interfaces.bean.RpcCommandResult;

public interface CoinRpcService {

	/**
	 *  判断用户金币是否足够
	 */
	RpcCommandResult checkCoin(String roomId, String userId, Integer bat);

	/**
	 * 结果
	 */
	RpcCommandResult playResult(String roomId, String userId, Integer bat, Integer bingo);
}

