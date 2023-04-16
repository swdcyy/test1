package com.tencent.connect.UserInfo;
import com.tencent.connect.common.BaseApi;
import android.content.Context;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import com.tencent.tauth.IUiListener;
import android.os.Bundle;
import com.tencent.connect.common.BaseApi$TempRequestListener;
import com.tencent.open.utils.f;
import java.lang.String;
import com.tencent.tauth.IRequestListener;
import com.tencent.open.utils.HttpUtils;

public class UserInfo extends BaseApi	// class@000e11
{

    public void UserInfo(Context p0,QQToken p1){
       super(p1);
    }
    public void UserInfo(Context p0,c p1,QQToken p2){
       super(p1, p2);
    }
    public void getOpenId(IUiListener p0){
       HttpUtils.requestAsync(this.c, f.a(), "oauth2.0/m_me", this.a(), "GET", new BaseApi$TempRequestListener(this, p0));
    }
    public void getUserInfo(IUiListener p0){
       HttpUtils.requestAsync(this.c, f.a(), "user/get_simple_userinfo", this.a(), "GET", new BaseApi$TempRequestListener(this, p0));
    }
}
