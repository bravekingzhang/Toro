/*
 * Copyright 2016 eneim@Eneim Labs, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.ene.lab.toro.media;

/**
 * Created by eneim on 7/1/16.
 *
 * Callback which will be triggered right before releasing the Media player.
 */
public interface LastMomentCallback {

  /**
   * Call right before {@code player} is released. Note that it will be null after this moment.
   *
   * @param player the Player which is being released.
   */
  void onLastMoment(Cineer player);
}
