package com.yxcorp.gifshow.v3.editor.sticker.g1;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import java.lang.String;

public final class g1 implements o	// class@001251
{
    public static final g1 b;

    static {
       g1.b = new g1();
    }
    public void g1(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = false;
       if (p0.mStickerType != 1) {
       }else if(TextUtils.x(p0.mRelatedClientId)){
          p0 = p0.mRelatedClientId;
          Objects.requireNonNull(p0);
          int i = -1;
          switch (p0.hashCode()){
              case '1':
                if (p0.equals("1")) {
                   i = 0;
                }
                break;
              case '2':
                if (p0.equals("2")) {
                   i = 1;
                }
                break;
              case '3':
                if (p0.equals("3")) {
                   i = 2;
                }
                break;
              case 1569:
                if (p0.equals("12")) {
                   i = 3;
                }
                break;
              case 1570:
                if (p0.equals("13")) {
                   i = 4;
                }
                break;
              case 1571:
                if (p0.equals("14")) {
                   i = 5;
                }
                break;
              default:
          }
          switch (i){
              case 0:
              case 2:
              case 3:
              case 4:
              case 5:
              case 1:
              default:
                b = true;
          }
       }
       return b;
    }
}
