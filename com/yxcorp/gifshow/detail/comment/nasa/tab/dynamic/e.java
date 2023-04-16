package com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.e;
import yg5.a;
import com.kwai.component.tabs.panel.h;
import java.lang.Class;
import android.os.Bundle;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.DynamicTabInfo;
import ix9.f;
import com.kwai.component.tabs.panel.h$d;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.e$a;
import com.kwai.component.tabs.panel.h$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import nx9.c;
import com.yxcorp.gifshow.comment.CommentConfig;
import m9a.d;
import androidx.fragment.app.Fragment;

public class e extends h implements a	// class@001390
{
    public String k;
    public BaseFragment l;
    public QPhoto m;
    public DynamicTabInfo n;
    public static int o = 0;
    public static int p = 1;

    public void e(Class p0,Bundle p1,String p2,int p3,QPhoto p4,DynamicTabInfo p5){
       super(p0, p1, p2, p3);
       this.m = p4;
       this.n = p5;
       this.k(new f(this));
       this.j(new e$a(this));
       this.h(this);
    }
    public void a(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.l = p0;
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, "RN_CONFIG_INFO", this.n.mRnConfigInfo);
       SerializableHook.putSerializable(uBundle, "RN_QUERY_PARAMS", this.n.mRnQueryParams);
       int o = (c.b())? e.o: e.p;
       uBundle.putInt("likeStyle", o);
       uBundle.putString("pageSource", this.k);
       CommentConfig mIsSupportWh = d.a(this.m).mIsSupportWhiteComment;
       uBundle.putBoolean("onlySupportLight", mIsSupportWh);
       uBundle.putBoolean("enableListenTheme", (mIsSupportWh ^ 0x01));
       uBundle.putString("photoId", this.m.getPhotoId());
       this.l.setArguments(uBundle);
       return;
    }
}
