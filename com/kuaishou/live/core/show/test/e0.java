package com.kuaishou.live.core.show.test.e0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.StringBuilder;
import wkd.b;
import j80.c;
import java.io.File;
import java.lang.String;
import qkd.b;
import java.lang.CharSequence;
import e17.i;

public final class e0 implements View$OnClickListener	// class@0011a4
{
    public static final e0 b;

    static {
       e0.b = new e0();
    }
    public void e0(){
       super();
    }
    public final void onClick(View p0){
       File uFile = new File(b.a(-1504323719).o().getAbsolutePath()+File.separatorChar+"anchorMockVideo"+File.separatorChar);
       if (uFile.exists() && b.q(uFile)) {
          i.d(R.style.arg_RES_7f110668, "ÒÑÇå³ý");
       }
       return;
    }
}
