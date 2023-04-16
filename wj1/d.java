package wj1.d;
import wj1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.live.core.show.giftslot.LiveGiftSlotSpecialCombo;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.text.style.AbsoluteSizeSpan;
import q38.a;
import lnc.a1;
import java.io.File;
import wj1.b;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;

public abstract class d implements c	// class@00454a
{
    public List a;
    public static final int[][] b;
    public static final float[][] c;

    static {
       float[] uofloatArray1;
       int[][] ointArray = new int[][5]{new int[3]{0x8e222222,0x33222222,0x222222},new int[3]{0xa6ffb431,0x4dffb431,0xffb431},new int[3]{0xa6fd637e,0x33fd637e,0xfd637e},new int[4]{0xc0a44fe3,0x8e5f20ff,0x4d5f20ff,0x5f20ff},new int[4]{0xcca44fe3,0x993ad2ff,0x213ad2ff,0x3ad2ff}};
       d.b = ointArray;
       float[][] uofloatArray = new float[][5]{uofloatArray1,uofloatArray1,new float[2]{0,0x3f800000},new float[3]{0,0x3f4ccccd,0x3f800000},new float[4]{0,0x3ecccccd,0x3f4ccccd,0x3f800000}};
       uofloatArray1 = new float[0];
       uofloatArray1 = new float[]{0};
       d.c = uofloatArray;
    }
    public void d(){
       super();
    }
    public float[] a(int p0){
       if (p0 > 0) {
          float[][] c = d.c;
          if (p0 < c.length) {
             return c[p0];
          }
       }
       return null;
    }
    public String b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uod = this.a;
       if (uod != null && !uod.isEmpty()) {
          int i = 0;
          while (i < this.a.size()) {
             LiveGiftSlotSpecialCombo liveGiftSlot = this.a.get(i);
             if (liveGiftSlot != null) {
                LiveGiftSlotSpecialCombo mComboCount = liveGiftSlot.mComboCount;
                if (mComboCount <= p0) {
                   if (p0 == mComboCount) {
                      return TextUtils.I(liveGiftSlot.mComboEffectResourceKey);
                   }
                }
             }
             i = i + 1;
          }
       }
       return null;
    }
    public boolean c(){
       return false;
    }
    public SpannableString d(int p0,int p1){
       SpannableString obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       obj = new SpannableString(String.format(" x%d ", objArray));
       obj.setSpan(new AbsoluteSizeSpan(24, 1), 1, 2, 17);
       obj.setSpan(new a(p1, 0x33000000, a1.e(0x3f19999a)), 0, obj.length(), 17);
       return obj;
    }
    public File e(int p0){
       return null;
    }
    public void f(List p0,List p1){
       b.a(this, p0, p1);
    }
    public Drawable g(){
       return null;
    }
    public int[] i(GiftSlotMessage p0){
       int i;
       int[][] obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n();
       p0 = p0.mNewGiftSlotStyle;
       if (p0 < null) {
          i = 0;
       }else if(p0 >= obj.length){
          i = obj.length - 1;
       }
       return obj[i];
    }
    public File k(GiftMessage p0){
       return null;
    }
    public int[] l(GiftMessage p0){
       int i;
       int[][] obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n();
       p0 = p0.mNewGiftSlotStyle;
       if (p0 < null) {
          i = 0;
       }else if(p0 >= obj.length){
          i = obj.length - 1;
       }
       return obj[i];
    }
    public boolean m(){
       return false;
    }
    public int[][] n(){
       return d.b;
    }
}
