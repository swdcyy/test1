package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.a;
import ok.h;
import java.lang.Object;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import ypc.a;
import nuc.a;
import java.lang.String;
import java.lang.Integer;

public final class a implements h	// class@000e51
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
       if (p0 != null && p0.second.l() != null) {
          tagPackage.identity = p0.second.b();
          tagPackage.name = p0.second.l().n();
          tagPackage.index = (long)(p0.first.intValue() + 1);
       }
       return tagPackage;
    }
}
