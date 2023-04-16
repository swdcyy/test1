package com.yxcorp.gifshow.share.platform.QQForward;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.String;
import mhc.x;

public interface abstract QQForward	// class@001c13
{
    public static final QQForward$Companion m0;

    static {
       QQForward.m0 = QQForward$Companion.d;
    }
    t G0(OperationModel p0,GifshowActivity p1);
    void J(OperationModel p0);
    t g0(KwaiOperator p0,String p1);
    x getForward();
    t i(KwaiOperator p0);
    t l(KwaiOperator p0);
    boolean m();
    t x(KwaiOperator p0);
}
