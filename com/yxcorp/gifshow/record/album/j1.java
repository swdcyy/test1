package com.yxcorp.gifshow.record.album.j1;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.IllegalArgumentException;
import java.lang.Integer;

public final class j1 implements o	// class@00172c
{
    public static final j1 b;

    static {
       j1.b = new j1();
    }
    public void j1(){
       super();
    }
    public final Object apply(Object p0){
       int i;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "2");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          int i1 = p0.size();
          p0 = p0.iterator();
          while (true) {
             if (p0.hasNext()) {
                String str = p0.next();
                String str1 = PatchProxy.applyOneRefs(str, null, LocalAlbumUtils.class, "5");
                int i2 = 0;
                if (str1 != patchProxyRe) {
                }else if(!TextUtils.x(str)){
                   str1 = ".trash";
                   if (str.endsWith(str1)) {
                      objArray1 = new Object[i2];
                      a.D().A("LocalAlbumUtils", "convertWorkspaceNameToId\(\) should not has suffix "+str, objArray1);
                      str1 = str.substring(i2, str.indexOf(str1));
                   }else {
                      str1 = "-editing";
                      if (str.endsWith(str1)) {
                         objArray1 = new Object[i2];
                         a.D().A("LocalAlbumUtils", "convertWorkspaceNameToId\(\)  should not has suffix "+str, objArray1);
                         str1 = str.substring(i2, str.indexOf(str1));
                      }else {
                         str1 = str;
                      }
                   }
                }else {
                   throw new IllegalArgumentException("convertWorkspaceNameToId with empty name!");
                }
                if (LocalAlbumUtils.H(str1)) {
                   Object[] objArray = new Object[i2];
                   a.D().w("LocalAlbumUtils", "countCouldShow\(\) workspace is publishing dirName="+str, objArray);
                   i1 = i1 - 1;
                }
             }else {
                i = i1;
                break ;
             }
          }
       }
       return Integer.valueOf(i);
    }
}
