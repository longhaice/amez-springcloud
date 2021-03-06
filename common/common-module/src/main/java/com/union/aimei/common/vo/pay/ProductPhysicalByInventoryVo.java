package com.union.aimei.common.vo.pay;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 产品库存
 *
 * @author liurenkai
 * @time 2018/3/5 10:54
 */
@Data
@EqualsAndHashCode
@ApiModel("美容师产品库存")
public class ProductPhysicalByInventoryVo implements Serializable {

    @ApiModelProperty("产品ID")
    private Integer productPhysicalId;

    @ApiModelProperty("产品数量")
    private Integer physicalNumber;

    @ApiModelProperty("美容师ID")
    private Integer beauticianId;

}
