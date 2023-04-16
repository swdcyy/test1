package com.yxcorp.gifshow.notice.krn.RCTNoticeCommentEditorManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.yxcorp.gifshow.notice.krn.RCTNoticeCommentEditorView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.util.Map;
import vd.d$b;
import vd.d;
import java.lang.Integer;
import com.facebook.react.uimanager.ViewManager;
import java.util.Objects;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.facebook.react.bridge.ReadableArray;
import fg6.a;
import com.yxcorp.gifshow.notice.krn.RCTNoticeCommentEditorManager$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import lc5.b;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.notice.krn.comment.NoticeCommentInfo;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import lu7.f;
import lnc.a1;
import stb.a;
import io.reactivex.subjects.PublishSubject;

public class RCTNoticeCommentEditorManager extends SimpleViewManager	// class@002194
{

    public void RCTNoticeCommentEditorManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public RCTNoticeCommentEditorView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RCTNoticeCommentEditorManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RCTNoticeCommentEditorView(p0);
    }
    public Map getCommandsMap(){
       d$b obj = PatchProxy.apply(null, this, RCTNoticeCommentEditorManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b("setup", Integer.valueOf(0));
       obj.b("setTransFormView", Integer.valueOf(1));
       obj.b("replyNoticeComment", Integer.valueOf(2));
       obj.b("hideKeyBoard", Integer.valueOf(3));
       return obj.a();
    }
    public String getName(){
       return "RCTNoticeCommentKeyBoardView";
    }
    public void onDropViewInstance(View p0){
       this.onDropViewInstance(p0);
    }
    public void onDropViewInstance(RCTNoticeCommentEditorView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RCTNoticeCommentEditorManager.class, "4")) {
          return;
       }
       super.onDropViewInstance(p0);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, RCTNoticeCommentEditorView.class, "3")) {
          p0 = p0.c;
          if (p0 != null) {
             p0.destroy();
          }
       }
       return;
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(RCTNoticeCommentEditorView p0,int p1,ReadableArray p2){
       List list;
       String str;
       String str1;
       if (PatchProxy.isSupport(RCTNoticeCommentEditorManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, RCTNoticeCommentEditorManager.class, "2")) {
          return;
       }
       if (p1 == 2) {
          if (p2 == null) {
             return;
          }else {
             a obj = null;
             try{
                list = a.a.i(p2.toString(), new RCTNoticeCommentEditorManager$a(this).getType());
             }catch(java.lang.Exception e0){
                String[] stringArray = new String[]{e0};
                b.f("parse NoticeCommentInfo from args error", stringArray);
                list = obj;
             }
             if (q.f(list)) {
                return;
             }else {
                int i = 0;
                NoticeCommentInfo noticeCommen = list.get(i);
                ReadableMap map = p2.getMap(i);
                if (map != null) {
                   try{
                      noticeCommen.mCommentInfoArgsStr = a.a.q(map.toHashMap());
                   }catch(java.lang.Exception e0){
                      String[] stringArray1 = new String[]{e0};
                      b.f("parse args to Json String error", stringArray1);
                   }
                }
             }
          }
       }
       return;
    }
}
