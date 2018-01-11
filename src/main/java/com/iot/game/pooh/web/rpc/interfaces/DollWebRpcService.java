package com.iot.game.pooh.web.rpc.interfaces;

/**
 * 娃娃机信息获取接口
 * @author zhuqiuyou
 *
 */
public interface DollWebRpcService {

	/**
	 * 根据网关注册获取的房间ID 获取房间名称
	 * @param roomId
	 * @return
	 */
	public String getRoomName(String roomId) throws Exception;
}

