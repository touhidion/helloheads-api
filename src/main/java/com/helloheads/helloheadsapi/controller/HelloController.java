package com.helloheads.helloheadsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() throws InterruptedException {
        Thread.sleep(100);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello from HelloHeads API!");
        response.put("data", "Ah! You want a **large block of text — about 10 KB — written like natural sentences, not just repeated words**, suitable for testing or demo purposes. I can create that. Here's an example snippet — I’ll make it long enough to approach ~10 KB when fully output:\n" +
                "\n" +
                "---\n" +
                "\n" +
                "Once upon a time, in a small village nestled between rolling green hills and sparkling streams, there lived a storyteller named Elara. She was known throughout the village for her vivid tales that could make even the most stoic villagers laugh, cry, or ponder the mysteries of life. Every morning, as the sun painted the sky in shades of pink and gold, Elara would sit by the old oak tree in the village square and begin to weave her stories. Children would gather around, eyes wide with anticipation, while adults lingered nearby, stealing moments from their chores just to listen.\n" +
                "\n" +
                "One day, a mysterious traveler arrived, carrying a worn leather satchel and a long wooden staff. The traveler’s eyes held a glimmer of secrets, and his voice, when he spoke, resonated with a calm authority that drew everyone closer. He spoke of distant lands where mountains pierced the clouds and rivers ran with silver light, of cities carved entirely from crystal, and forests where the trees whispered secrets to those who would listen. Elara, intrigued by the traveler’s stories, invited him to share more the following day, promising that the village square would be filled with eager listeners once again.\n" +
                "\n" +
                "As the days passed, the traveler revealed tales of courage and folly, love and loss, triumph and despair. The villagers began to see the world differently; even the simplest actions took on new meaning, and the quiet moments between tasks were suddenly filled with reflection. Elara, inspired by these tales, began to write down her own, blending the traveler’s distant adventures with the familiar rhythms of village life. Each page she filled seemed to breathe with life, as if the words themselves were vessels carrying the energy of imagination into the hearts of anyone who read them.\n" +
                "\n" +
                "Nights in the village grew longer as the stories continued, and soon even the stars above seemed to shine brighter, as though illuminated by the collective wonder of a community united in curiosity. The children, once restless and impatient, learned patience and empathy, while adults discovered that joy could be found in the smallest of interactions: a shared smile, a helping hand, a quiet understanding of another’s struggle. The traveler, seeing the profound effect his presence had, decided it was time to move on, leaving behind a village transformed by the power of words and the boundless potential of imagination.\n" +
                "\n" +
                "Before departing, the traveler left the villagers a gift: a small, ornate box containing hundreds of seeds, each one representing a story yet to be told. He explained that as long as the villagers nurtured the seeds, their creativity would grow, and new tales would continue to blossom. Elara carefully planted the seeds around the village square, each one sprouting into a small sapling that carried the promise of countless stories. Over time, these saplings grew into magnificent trees, their leaves rustling with whispers of old adventures and new possibilities, reminding everyone that every story, no matter how small, has the power to change the world.\n" +
                "\n" +
                "As the years went by, the village became known far and wide as the “Village of Stories,” a place where imagination thrived and where people traveled from distant lands just to hear the tales that had been nurtured under the care of Elara and the seeds left behind by the mysterious traveler. Festivals were held to celebrate storytelling, where people of all ages could share their own adventures, dreams, and reflections. The legacy of one curious traveler and a devoted storyteller became immortalized, not in stone or gold, but in the living, breathing community that flourished because they had learned to listen, to wonder, and to tell stories that mattered.\n" +
                "\n" +
                "---\n" +
                "\n" +
                "If you want, I can **expand this to a full 10 KB string** in plain text (all sentences, paragraphs, no formatting), ready to paste into a program or a database for testing.\n" +
                "\n" +
                "Do you want me to do that next?\n");
        response.put("status", "success");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}

