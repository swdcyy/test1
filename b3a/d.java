package b3a.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.ImmutableList$a;
import com.google.common.collect.ImmutableList;
import com.yxcorp.gifshow.detail.nonslide.toolbar.ToolbarAction;
import com.kwai.framework.model.user.User;
import wh5.c;
import vca.i;
import com.kwai.sdk.switchconfig.a;
import j2a.b;
import java.util.ArrayList;
import java.util.Iterator;

public final class d	// class@00035d
{

    public void d(){
       super();
    }
    public static List a(QPhoto p0){
       boolean b4;
       ImmutableList$a obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ImmutableList.builder();
       obj.h(ToolbarAction.BACK);
       obj.h(ToolbarAction.LIKE);
       User user = p0.getUser();
       boolean b = c.h();
       boolean b1 = i.d(p0);
       boolean b2 = false;
       boolean b3 = a.t().d("privacyPhotoAllowForward", b2);
       if (p0.isMine()) {
          if (!b1 && b) {
             obj.h(ToolbarAction.MORE);
          }
          if (b) {
             if (p0.isPublic()) {
                obj.h(ToolbarAction.FORWARD);
             }else if(b3){
                obj.h(ToolbarAction.FORWARD_PRIVACY);
             }
          }else if(p0.canDownload()){
             obj.h(ToolbarAction.DOWNLOAD);
          }
       }else if(user != null && user.mPrivate != null){
          b4 = true;
       }else {
          b4 = false;
       }
       if (b4) {
          if (b1 && i.g(p0)) {
             b2 = true;
          }
          if (!c.b() && !b2) {
             obj.h(ToolbarAction.REPORT);
          }
          if (b && !b2) {
             obj.h(ToolbarAction.MORE);
          }
       }else if(b1 && i.g(p0)){
          b2 = true;
       }
       if (!c.b() && !b2) {
          if (b.b()) {
             obj.h(ToolbarAction.COLLECT);
          }else {
             obj.h(ToolbarAction.REPORT);
          }
       }else if(b && !b2){
          obj.h(ToolbarAction.MORE);
       }
       if (b) {
          obj.h(ToolbarAction.FORWARD);
       }
    label_00c7 :
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.i().iterator();
       while (iterator.hasNext()) {
          ToolbarAction toolbarActio = iterator.next();
          if (toolbarActio == ToolbarAction.BACK || toolbarActio == ToolbarAction.MORE) {
             uArrayList.add(toolbarActio);
          }
       }
       uArrayList.add(ToolbarAction.SEARCH);
       return uArrayList;
    }
}
