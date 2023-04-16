package com.yxcorp.gifshow.share.util.PhotoForward;
import com.yxcorp.gifshow.share.OperationModel;
import msd.p;
import brd.t;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;

public interface abstract PhotoForward	// class@001c90
{

    t F0(OperationModel p0,boolean p1,boolean p2,p p3);
    t O0(OperationModel p0,boolean p1,boolean p2,p p3);
    Bitmap S(OperationModel p0,Bitmap p1);
    t W(OperationModel p0,boolean p1,boolean p2,p p3);
    SharePlatformData$ShareConfig a(OperationModel p0);
    t c(OperationModel p0);
    t q(OperationModel p0,p p1);
    Bitmap y(OperationModel p0);
}
