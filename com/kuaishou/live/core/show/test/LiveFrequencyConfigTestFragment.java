package com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig;
import java.lang.reflect.Type;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import il2.d;
import android.view.View$OnClickListener;
import il2.e;
import il2.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$c;
import il2.f;
import java.util.List;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$b;
import il2.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$a;
import android.widget.ListAdapter;
import android.text.TextWatcher;

public class LiveFrequencyConfigTestFragment extends BaseFragment	// class@00118f
{
    public final LiveMessageFrequencyConfig j;
    public final List k;
    public AutoCompleteTextView l;
    public RecyclerView m;
    public TextView n;
    public TextView o;
    public String p;
    public static final int q;

    public void LiveFrequencyConfigTestFragment(){
       super();
       LiveMessageFrequencyConfig value = a.t().u("SOURCE_LIVE").getValue("frequencyConfig", LiveMessageFrequencyConfig.class, null);
       this.j = value;
       ArrayList uArrayList = (value != null)? new ArrayList(value.getFrequencyConfigMap().keySet()): new ArrayList();
       this.k = uArrayList;
       return;
    }
    public final LiveMessageFrequencyConfig$FrequencyConfig ch(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveFrequencyConfigTestFragment.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (this.j == null) {
          return null;
       }
       if (TextUtils.x(this.p)) {
          i.d(R.style.arg_RES_7f11066a, "暂无选中bizId");
          return null;
       }else {
          LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = this.j.getFrequencyConfigMap().get(this.p);
          if (uFrequencyCo != null) {
             return uFrequencyCo;
          }
          i.d(R.style.arg_RES_7f11066a, "没有查询到频控信息");
          return null;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveFrequencyConfigTestFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0b14, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFrequencyConfigTestFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveFrequencyConfigTestFragment.class, "3")) {
          this.l = m1.f(p0, 0x7f0a08f5);
          this.m = m1.f(p0, 0x7f0a08f9);
          this.n = m1.f(p0, 0x7f0a022e);
          this.o = m1.f(p0, 0x7f0a022c);
          m1.a(p0, new d(this), R.id.config_input_key_clear);
          m1.a(p0, new e(this), R.id.appear_times_by_duration_clear);
          m1.a(p0, new c(this), R.id.appear_times_by_live_stream_clear);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, LiveFrequencyConfigTestFragment.class, "5")) {
             LiveFrequencyConfigTestFragment tm = this.m;
             tm.setLayoutManager(new LinearLayoutManager(tm.getContext()));
             tm = this.m;
             tm.addItemDecoration(new i(tm.getContext(), 1));
             this.m.setAdapter(new LiveFrequencyConfigTestFragment$c(this, this.k, new f(this), objArray));
          }
          if (!PatchProxy.applyVoid(objArray, this, LiveFrequencyConfigTestFragment.class, "4")) {
             LiveFrequencyConfigTestFragment$a uoa = new LiveFrequencyConfigTestFragment$a(this.l.getContext(), 0x1090003);
             LiveFrequencyConfigTestFragment tk = this.k;
             if (!PatchProxy.applyVoidOneRefs(tk, uoa, LiveFrequencyConfigTestFragment$a.class, "1")) {
                uoa.b = tk;
                uoa.a(tk);
             }
             this.l.setAdapter(uoa);
             this.l.addTextChangedListener(new g(this));
          }
       }
       return;
    }
}
