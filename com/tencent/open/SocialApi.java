package com.tencent.open.SocialApi;
import com.tencent.connect.auth.QQToken;
import java.lang.Object;
import com.tencent.open.SocialApiIml;
import android.app.Activity;
import android.os.Bundle;
import com.tencent.tauth.IUiListener;

public class SocialApi	// class@000f2b
{
    public SocialApiIml a;

    public void SocialApi(QQToken p0){
       super();
       this.a = new SocialApiIml(p0);
    }
    public void ask(Activity p0,Bundle p1,IUiListener p2){
       this.a.ask(p0, p1, p2);
    }
    public void gift(Activity p0,Bundle p1,IUiListener p2){
       this.a.gift(p0, p1, p2);
    }
    public void invite(Activity p0,Bundle p1,IUiListener p2){
       this.a.invite(p0, p1, p2);
    }
    public void story(Activity p0,Bundle p1,IUiListener p2){
       this.a.story(p0, p1, p2);
    }
}
