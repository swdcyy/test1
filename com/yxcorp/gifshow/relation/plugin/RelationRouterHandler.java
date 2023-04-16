package com.yxcorp.gifshow.relation.plugin.RelationRouterHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import xh7.a;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.relation.plugin.RelationRouterHandler$a;
import qyb.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper;

public class RelationRouterHandler extends AnnotationUriHandler	// class@001936
{

    public void RelationRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RelationRouterHandler.class, "1")) {
          return;
       }
       Activity uActivity = a.b(p0.b());
       if (uActivity instanceof GifshowActivity) {
          SettingPluginHelper.c(uActivity, null, new RelationRouterHandler$a(this, p1));
       }
       return;
    }
}
