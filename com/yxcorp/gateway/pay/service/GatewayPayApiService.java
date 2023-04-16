package com.yxcorp.gateway.pay.service.GatewayPayApiService;
import java.lang.String;
import brd.t;

public interface abstract GatewayPayApiService	// class@001276
{

    t authParams(String p0,String p1,String p2);
    t bind(String p0,String p1,String p2,String p3);
    t confirmPaySuccess(String p0,String p1,String p2);
    t createPayOder(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7);
    t depositPrepay(String p0,long p1,String p2,String p3,String p4,String p5,boolean p6);
    t depositQuery(String p0,String p1,String p2);
    t gatewayPayConfig(String p0,boolean p1,boolean p2,boolean p3,boolean p4);
    t gatewayPayPrepay(String p0,String p1,String p2,long p3,String p4,String p5,String p6,String p7,String p8);
    t orderCashierConfig(String p0,String p1,boolean p2,boolean p3,boolean p4,boolean p5);
    t orderTrade(String p0,String p1,String p2,String p3,String p4);
    t preQueryPromo(String p0);
    t queryPayResult(String p0,String p1);
    t queryPayResult(String p0,String p1,String p2);
}
