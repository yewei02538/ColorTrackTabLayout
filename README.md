# ColorTrackTabLayout
一个自适应Tab宽度，可以滑动文字逐渐变色的`TabLayout`,该控件继承自TabLayout做了一些扩展。

# Blog
[自适应Tab宽度可以滑动文字逐渐变色的TabLayout](http://www.jianshu.com/p/4ab5e09a30e8)

# 效果

![](/screenshot/screenshot.gif)

# Usage
Use Gradle:

>compile 'me.weyye.ColorTrackTabLayout:library:1.0.1'

Or Maven:

><dependency>
>  <groupId>me.weyye.ColorTrackTabLayout</groupId>
>  <artifactId>library</artifactId>
>  <version>1.0.1</version>
>  <type>pom</type>
></dependency>

# Sample
使用方法跟`TabLayout`一模一样
``` java
        titles = new String[]{"推荐", "视频", "社会"};
        final List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            fragments.add(MyFragment.newInstance());
        }


        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return titles.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        });
		//隐藏指示器
		mTab.setSelectedTabIndicatorHeight(0);
		//设置每个Tab的内边距
		mTab.setTabPaddingLeftAndRight(20, 20);
        mTab.setupWithViewPager(mViewPager);
```

xml

``` xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_today_news_acitivty"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="me.weyye.colortracktablayout.TodayNewsAcitivty">

    <me.weyye.library.colortrackview.ColorTrackTabLayout
        android:id="@+id/tab"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:background="#ffffff"
        app:tabIndicatorColor="@color/red"
        app:tabMode="scrollable"
        app:tabSelectedTextColor="@color/red"
        app:tabTextAppearance="@style/TabStyle"
        app:tabTextColor="@color/black"/>

    <android.support.v4.view.ViewPager
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
</LinearLayout>
```

# 鸣谢

[ColorTrackView](https://github.com/hongyangAndroid/ColorTrackView)


# License

	Copyright (C) 2017 WeyYe

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.