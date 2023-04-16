package com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter$a;
import erd.g;
import com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public final class AtMeTabSettingPresenter$a implements g	// class@0008cf
{
    public final AtMeTabSettingPresenter b;
    public final int c;

    public void AtMeTabSettingPresenter$a(AtMeTabSettingPresenter p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtMeTabSettingPresenter$a.class, "1")) {
       }else {
          QCurrentUser.ME.startEdit().setMentionedMeWorksSetting(this.c).commitChanges();
          p0 = this.b;
          AtMeTabSettingPresenter$a tc = this.c;
          p0.D = tc;
          p0 = p0.B;
          if (p0 != null) {
             p0.onNext(Integer.valueOf(tc));
          }
       }
       return;
    }
}
