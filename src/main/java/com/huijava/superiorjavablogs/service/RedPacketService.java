package com.huijava.superiorjavablogs.service;

import com.huijava.superiorjavablogs.common.base.Service;
import com.huijava.superiorjavablogs.dto.RedPacketDTO;
import com.huijava.superiorjavablogs.entity.RedPacket;

import java.util.List;


/**
 * @author chenhaoxiang
 * @date 2019-02-01 01:41:24
 */
public interface RedPacketService extends Service<RedPacket> {

    int insertSelective(RedPacket redPacket);

    /**
     * 通过邀请码获取
     *
     * @param invitationCode
     * @return
     */
    RedPacket getByInvitationCode(String invitationCode);

    /**
     * 通过wxusers id获取
     *
     * @param wxUsersId
     * @return
     */
    RedPacket getByWxUsersId(Integer wxUsersId);

    List<RedPacketDTO> findRedPacketDTOList();

}
