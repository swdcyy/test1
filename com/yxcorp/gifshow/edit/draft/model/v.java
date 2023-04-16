package com.yxcorp.gifshow.edit.draft.model.v;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Object;
import java.util.Objects;
import laa.p;
import java.io.FileFilter;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import haa.f;
import q87.c;

public final class v implements Callable	// class@001b12
{
    public final DraftFileManager b;
    public final File c;

    public void v(DraftFileManager p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       boolean b;
       v tb = this.b;
       v tc = this.c;
       Objects.requireNonNull(tb);
       File[] uFileArray = tc.listFiles(new p(tb));
       ArrayList uArrayList = new ArrayList();
       if (uFileArray != null && uFileArray.length > 0) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             List obj = PatchProxy.applyOneRefs(oobject, tb, DraftFileManager.class, "92");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = tb.K(oobject);
                if (obj.isEmpty()) {
                   b = true;
                }else {
                   File parentFile = oobject.getParentFile();
                   String str = tb.N(oobject);
                   Iterator iterator = obj.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         String str1 = iterator.next();
                         if (!TextUtils.x(str1) && new File(parentFile, str1+str).exists()) {
                            b = TextUtils.n(str1+str, oobject.getName());
                         }
                      }else {
                         b = false;
                      }
                   }
                }
             }
             if (b) {
                if (new File(oobject, "workspace.pb").exists()) {
                   uArrayList.add(oobject.getName());
                }else {
                   Object[] objArray = new Object[0];
                   f.D().w("DraftFileManager", "getWorkspaceList\(\) no workspace.pb "+oobject, objArray);
                }
             }
             i = i + 1;
          }
       }
       Object[] objArray1 = new Object[0];
       f.D().w("DraftFileManager", "getWorkspaceList\(\) workspace num="+uArrayList.size()+" dir="+tc, objArray1);
       return uArrayList;
    }
}
