package com.tencent.connect.avatar.ImageActivity$QQAvatarImp;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.avatar.ImageActivity;
import com.tencent.connect.auth.QQToken;
import android.graphics.Bitmap;
import com.tencent.tauth.IUiListener;
import android.os.Bundle;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import com.tencent.connect.common.BaseApi$TempRequestListener;
import java.lang.String;
import android.content.Context;
import com.tencent.open.utils.f;
import com.tencent.tauth.IRequestListener;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.b.e;

public class ImageActivity$QQAvatarImp extends BaseApi	// class@000e36
{
    public final ImageActivity a;

    public void ImageActivity$QQAvatarImp(ImageActivity p0,QQToken p1){
       this.a = p0;
       super(p1);
    }
    public void setAvator(Bitmap p0,IUiListener p1){
       Bundle uBundle = this.a();
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       p0.compress(Bitmap$CompressFormat.JPEG, 40, uByteArrayOu);
       p0.recycle();
       uBundle.putByteArray("picture", uByteArrayOu.toByteArray());
       HttpUtils.requestAsync(this.c, f.a(), "user/set_user_face", uBundle, "POST", new BaseApi$TempRequestListener(this, p1));
       e.a().a(this.c.getOpenId(), this.c.getAppId(), "ANDROIDSDK.SETAVATAR.SUCCEED", "12", "19", "0");
    }
}
