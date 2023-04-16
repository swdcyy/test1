package com.yxcorp.gifshow.profile.fragment.j;
import ok.h;
import com.yxcorp.gifshow.profile.fragment.UserMentionedMeTabFragment;
import java.lang.Object;
import java.lang.Void;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import k3c.a2;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class j implements h	// class@001327
{
    public final UserMentionedMeTabFragment b;

    public void j(UserMentionedMeTabFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       j tb = this.b;
       a2 uoa2 = new a2(tb);
       return tb.G.b.observable().compose(c.c(tb.m(), FragmentEvent.DESTROY)).subscribe(uoa2, Functions.e);
    }
}
