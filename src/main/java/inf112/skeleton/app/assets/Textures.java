package inf112.skeleton.app.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public enum Textures {
    Player("Dungeon Crawl Stone Soup Full/player/base/centaur_darkbrown_male.png"),
    Floor("Dungeon Crawl Stone Soup Full/dungeon/floor/grass/grass0-dirt-mix_1.png"),
    Wall("Dungeon Crawl Stone Soup Full/dungeon/wall/brick_brown_2.png"),
    Lava("Dungeon Crawl Stone Soup Full/dungeon/floor/lava_2.png"),
    Snake("Dungeon Crawl Stone Soup Full/monster/animals/snake.png"),
    Rock("rock placeholder.png");
    

    public final Texture texture;
    Textures (String path) {
        this.texture = new Texture(Gdx.files.internal(path));
    }

    public static void dispose() {
        for (var texture : values()) {
            texture.texture.dispose();
        }
    }
}
