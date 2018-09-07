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

	/**
	 * 用户下机
	 * @param userId 用户ID
	 * @param gameId 期号
	 * @param roomId 房间ID
	 * @return
	 */
	RpcCommandResult userDownMachine(String userId,String gameId,String roomId);
}

