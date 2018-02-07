package com.shixzh.spring.spring4redis;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MusicService {

    private int count;

    @Cacheable(value = "messageCache1", condition = "'guitar'.equals(#instrument)")
    public String play(final String instrument) {
        System.out.println("Executing: " + this.getClass().getSimpleName() + ".play(" + instrument + ")");
        String result = "playing " + instrument + " : " + count;
        count++;
        return result;
    }

    @CacheEvict(value = "messageCache")
    public String cleanMessageCache() {
        return "Clean Success!";
    }
}
