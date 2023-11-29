package rouchuan.viewpagerlayoutmanager.circle;

import com.leochuan.CircleLayoutManager;

import rouchuan.viewpagerlayoutmanager.BaseActivity;

public class CircleLayoutActivity extends BaseActivity<CircleLayoutManager, CirclePopUpWindow> {

    @Override
    protected CircleLayoutManager createLayoutManager() {
        return new CircleLayoutManager(this);
    }

    @Override
    protected CirclePopUpWindow createSettingPopUpWindow() {
        return new CirclePopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
