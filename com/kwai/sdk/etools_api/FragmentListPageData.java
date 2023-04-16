package com.kwai.sdk.etools_api.FragmentListPageData;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.Class;

public class FragmentListPageData	// class@00142b
{
    public final WeakReference mRecyclerViewRef;
    public final WeakReference mShowingFragmentRef;

    public void FragmentListPageData(Fragment p0,RecyclerView p1){
       super();
       this.mShowingFragmentRef = new WeakReference(p0);
       this.mRecyclerViewRef = new WeakReference(p1);
    }
    public String getFragmentListPageName(){
       String simpleName = (this.mShowingFragmentRef.get() != null)? this.mShowingFragmentRef.get().getClass().getSimpleName(): "";
       return simpleName;
    }
    public RecyclerView getRecyclerView(){
       return this.mRecyclerViewRef.get();
    }
    public Fragment getShowingFragment(){
       return this.mShowingFragmentRef.get();
    }
}
