package com.tencent.connect.UnionInfo;
import com.tencent.connect.common.BaseApi;
import android.content.Context;
import com.tencent.connect.auth.QQToken;
import com.tencent.tauth.IUiListener;
import android.os.Bundle;
import java.lang.String;
import com.tencent.connect.common.BaseApi$TempRequestListener;
import com.tencent.open.utils.f;
import com.tencent.tauth.IRequestListener;
import com.tencent.open.utils.HttpUtils;

public class UnionInfo extends BaseApi	// class@000e10
{

    public void UnionInfo(Context p0,QQToken p1){
       super(p1);
    }
    public void getUnionId(IUiListener p0){
       Bundle uBundle = this.a();
       uBundle.putString("unionid", "1");
       HttpUtils.requestAsync(this.c, f.a(), "https://openmobile.qq.com/oauth2.0/me", uBundle, "GET", new BaseApi$TempRequestListener(this, p0));
    }
}
