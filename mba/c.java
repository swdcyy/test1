package mba.c;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.Objects;
import java.io.File;
import laa.m0;
import java.lang.String;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.utility.SystemUtil;
import haa.f;
import q87.c;

public final class c implements o	// class@002fa8
{
    public final c b;

    public void c(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       Object[] objArray;
       boolean b;
       c tb = this.b;
       Objects.requireNonNull(tb);
       File uFile = new File(tb.f0(), p0.getKey());
       if (uFile.exists()) {
          p0 = Boolean.TRUE;
       }else {
          File uFile1 = new File(p0.getValue());
          if (!uFile1.exists()) {
             PostUtils.D("WorkspaceDraft", "copyFilesFromFileMap\(\) src not exist "+uFile1, new RuntimeException("not exist "+uFile1));
             tb.l0();
             p0 = Boolean.FALSE;
          }else {
             long l = SystemUtil.y();
             long l1 = uFile1.length();
             int i = 0;
             if ((l - l1) - 0x12c00000 < 0) {
                objArray = new Object[i];
                f.D().w("WorkspaceDraft", "copyFilesFromFileMap\(\) disk is too low ignore copy freeSize="+l+" fileSize="+l1, objArray);
                p0 = Boolean.FALSE;
             }else {
                String str = uFile.getAbsolutePath()+".tmp";
                try{
                   File uFile2 = new File(str);
                   PostUtils.c(uFile1, uFile2);
                   b = uFile2.renameTo(uFile);
                }catch(java.io.IOException e0){
                   b = false;
                }
                objArray = new Object[e0];
                f.D().w("WorkspaceDraft", "copyFilesFromFileMap\(\) ok="+b+" "+p0.getKey(), objArray);
                p0 = Boolean.valueOf(b);
             }
          }
       }
       return p0;
    }
}
