package com.union.aimei.app.api.im;

import com.union.aimei.common.vo.im.common.*;
import com.union.aimei.common.feign.app.im.EasemobImMessagesFeign;
import com.union.common.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * IM消息controller
 *
 * @author liurenkai
 * @time 2017/11/29 16:35
 */
@Api(tags = "IM消息 controller")
@RestController
@RequestMapping(value = "/easemob/im/messages")
public class EasemobImMessagesApiController {
    @Resource
    private EasemobImMessagesFeign easemobImMessagesFeign;

    /**
     * 发送文本消息
     *
     * @param msgTxt 文本消息
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "发送文本消息")
    @PostMapping("/send/txt")
    public ResponseMessage<ResponseResult> sendTxt(@ApiParam(value = "文本消息") @RequestBody MsgTxt msgTxt) {
        return this.easemobImMessagesFeign.sendTxt(msgTxt);
    }

    /**
     * 发送图片消息
     *
     * @param msgImg 图片消息
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "发送图片消息")
    @PostMapping("/send/img")
    public ResponseMessage<ResponseResult> sendImg(@ApiParam(value = "图片消息") @RequestBody MsgImg msgImg) {
        return this.easemobImMessagesFeign.sendImg(msgImg);
    }

    /**
     * 发送语音消息
     *
     * @param msgAudio 语音消息
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "发送语音消息")
    @PostMapping("/send/audio")
    public ResponseMessage<ResponseResult> sendAudio(@ApiParam(value = "语音消息") @RequestBody MsgAudio msgAudio) {
        return this.easemobImMessagesFeign.sendAudio(msgAudio);
    }

    /**
     * 发送视频消息
     *
     * @param msgVideo 视频消息
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "发送视频消息")
    @PostMapping("/send/video")
    public ResponseMessage<ResponseResult> sendVideo(@ApiParam(value = "视频消息") @RequestBody MsgVideo msgVideo) {
        return this.easemobImMessagesFeign.sendVideo(msgVideo);
    }

    /**
     * 发送透传消息
     *
     * @param msgCmd 透传消息
     * @return
     */
    @ApiOperation(httpMethod = "POST", value = "发送透传消息")
    @PostMapping("/send/cmd")
    public ResponseMessage<ResponseResult> sendCmd(@ApiParam(value = "透传消息") @RequestBody MsgCmd msgCmd) {
        return this.easemobImMessagesFeign.sendCmd(msgCmd);
    }

}