package rouchuan.viewpagerlayoutmanager.carousel;

import com.leochuan.CarouselLayoutManager;

import rouchuan.viewpagerlayoutmanager.BaseActivity;
import rouchuan.viewpagerlayoutmanager.Util;

public class CarouselLayoutActivity extends BaseActivity<CarouselLayoutManager, CarouselPopUpWindow> {

    @Override
    protected CarouselLayoutManager createLayoutManager() {
        return new CarouselLayoutManager(this, Util.Dp2px(this, 100));
    }

    @Override
    protected CarouselPopUpWindow createSettingPopUpWindow() {
        return new CarouselPopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
