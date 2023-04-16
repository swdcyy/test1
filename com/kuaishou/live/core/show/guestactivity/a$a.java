package com.kuaishou.live.core.show.guestactivity.a$a;
import androidx.recyclerview.widget.h$b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import n92.j;
import n92.g0;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Number;

public class a$a extends h$b	// class@000bcd
{
    public List a;
    public List b;

    public void a$a(List p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(int p0,int p1){
       j obj;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoa = this.a;
       boolean b = false;
       if (uoa == null || (this.b == null || (p0 < uoa.size() && p1 < this.b.size()))) {
          obj = this.a.get(p0);
          j oj = this.b.get(p1);
          if (obj != null && oj != null) {
             if (g0.b(this.a.size(), p0) && g0.b(this.b.size(), p1)) {
                return TextUtils.equals(obj.a, oj.a);
             }else {
                j b1 = obj.b;
                if (b1 != null) {
                   j b2 = oj.b;
                   if (b2 != null) {
                      LiveActivitySignalMessage$LiveSpecialAudienceRankInfo specialAudie = b1.specialAudienceUser;
                      if (specialAudie != null) {
                         LiveActivitySignalMessage$LiveSpecialAudienceRankInfo specialAudie1 = b2.specialAudienceUser;
                         if (specialAudie1 != null) {
                            specialAudie = (!specialAudie.userId - specialAudie1.userId)? 1: 0;
                            specialAudie1 = (b1.rankIndex == b2.rankIndex)? 1: 0;
                            boolean b3 = TextUtils.equals(b1.popularityTitle, b2.popularityTitle);
                            boolean b4 = TextUtils.equals(obj.b.popularity, oj.b.popularity);
                            if (specialAudie && (specialAudie1 && (b3 && b4))) {
                               b = true;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return b;
    }
    public boolean b(int p0,int p1){
       j obj;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoa = this.a;
       boolean b = false;
       if (uoa == null || (this.b == null || (p0 < uoa.size() && p1 < this.b.size()))) {
          obj = this.a.get(p0);
          j oj = this.b.get(p1);
          if (obj != null && oj != null) {
             if (g0.b(this.a.size(), p0) && g0.b(this.b.size(), p1)) {
                return true;
             }else {
                j b1 = obj.b;
                if (b1 != null) {
                   j b2 = oj.b;
                   if (b2 != null) {
                      LiveActivitySignalMessage$LiveSpecialAudienceRankInfo specialAudie = b1.specialAudienceUser;
                      if (specialAudie != null) {
                         LiveActivitySignalMessage$LiveSpecialAudienceRankInfo specialAudie1 = b2.specialAudienceUser;
                         if (specialAudie1 != null && !specialAudie.userId - specialAudie1.userId) {
                            b = true;
                         }
                      }
                   }
                }
             }
          }
       }
       return b;
    }
    public int d(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (obj != null)? obj.size(): 0;
       return i;
    }
    public int e(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.size(): 0;
       return i;
    }
}
