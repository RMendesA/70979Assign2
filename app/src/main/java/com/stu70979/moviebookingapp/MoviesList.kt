package com.stu70979.moviebookingapp

import kotlin.random.Random
import kotlin.random.nextInt

data class Movie(
    val name: String,
    val id : Int,
    var image: String,
    val contentDescription: String,
    val movieDescription: String,
    val runTime: Int,
    var seatsRemaining: Int,
    var seatsSelected: Int,
) {
    companion object
}

object MoviesList {
    val movie = listOf(
        Movie(
            name = "DUNE: PART TWO",
            id = 0,
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/7a7a20aa-1064-46fd-96cc-4b271268f2c5_dune-part-ii_posters_one-sheet_712px.jpg?mw=450&rev=c61dcb539042435c973daaeeb97100b6",
            contentDescription = "DUNE: PART TWO",
            movieDescription = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the known universe, he endeavors to prevent a terrible future only he can foresee.",
            runTime = 166,
            seatsRemaining = Random.nextInt(0, 15),
            seatsSelected = 0,
        ),
        Movie(
            name = "GHOSTBUSTERS: FROZEN EMPIRE",
            id = 1,
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/film-and-events/feb-2024/ghostbusters-poster.jpg?mw=450&rev=890c7016efc4412293629c8d63844732",
            contentDescription = "GHOSTBUSTERS: FROZEN EMPIRE",
            movieDescription = "In Ghostbusters: Frozen Empire, the Spengler family returns to where it all started – the iconic New York City firehouse – to team up with the original Ghostbusters, who’ve developed a top-secret research lab to take busting ghosts to the next level. But when the discovery of an ancient artifact unleashes an evil force, Ghostbusters new and old must join forces to protect their home and save the world from a second Ice Age." ,
            runTime = 144,
            seatsRemaining = Random.nextInt(0..15),
            seatsSelected = 0
        ),
        Movie(
            name = "KUNG FU PANDA 4",
            id = 2,
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/a223aaeb-6a2d-4561-92f0-e3efa105a21e_kung-fu-panda-4_posters_kf4_intl_dgtl_payoff_1sheet_uk_712px.jpg?mw=450&rev=7239547d058742c7b4ee0899fe51c29e",
            contentDescription = "KUNG FU PANDA 4",
            movieDescription = "After Po is tapped to become the Spiritual Leader of the Valley of Peace, he needs to find and train a new Dragon Warrior, while a wicked sorceress plans to re-summon all the master villains whom Po has vanquished to the spirit realm." ,
            runTime = 94,
            seatsRemaining = Random.nextInt(0..15),
            seatsSelected =1
        ),
        Movie(
            name = "GODZILLA X KONG: THE NEW EMPIRE",
            id = 3,
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/7bf51248-5164-49ec-ab6f-090e904a263f_godzilla-x-kong-the-new-empire_posters_teaser---one-sheet_712px.jpg?mw=450&rev=013f431ef34d4bd98344d19d229a4345",
            contentDescription = "GODZILLA X KONG: THE NEW EMPIRE",
            movieDescription = "The epic battle continues! Legendary Pictures’ cinematic Monsterverse follows up the explosive showdown of “Godzilla vs. Kong” with an all-new adventure that pits the almighty Kong and the fearsome Godzilla against a colossal undiscovered threat hidden within our world, challenging their very existence—and our own. “Godzilla x Kong: The New Empire” delves further into the histories of these Titans and their origins, as well as the mysteries of Skull Island and beyond, while uncovering the mythic battle that helped forge these extraordinary beings and tied them to humankind forever." ,
            runTime = 115,
            seatsRemaining = Random.nextInt(0..15),
            seatsSelected =1
        ),
        Movie(
            name = "MIGRATION",
            id = 4,
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/fddf86f4-a848-4ffd-9a05-b602edc77b70_migration_posters_mig_intl_dgtl_one_sheet_opt_1_landing_uk_712p.jpg?mw=450&rev=69acf0619d6946d596b112f278bf4bd5",
            contentDescription = "MIGRATION",
            movieDescription = "A family of ducks decides to leave the safety of a New England pond for an adventurous trip to Jamaica. However, their well-laid plans quickly go awry when they get lost and wind up in New York City. The experience soon inspires them to expand their horizons, open themselves up to new friends, and accomplish more than they ever thought possible.",
            runTime = 90,
            seatsRemaining = Random.nextInt(0..15),
            seatsSelected =1
        ),
        Movie(
            name = "WICKED LITTLE LETTERS",
            id = 5,
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/2f93acca-53ff-41f7-a57c-42d191057f02_wicked-little-letters_posters_wicked-little-letters-poster-uk--.jpg?mw=450&rev=19d4909958cd40759403c26e7762f30d",
            contentDescription = "WICKED LITTLE LETTERS",
            movieDescription = "A 1920s English seaside town bears witness to a dark and absurd scandal in this riotous mystery comedy. Based on a stranger than fiction true story, WICKED LITTLE LETTERS follows two neighbours: deeply conservative local Edith Swan (Olivia Colman) and rowdy Irish migrant Rose Gooding (Jessie Buckley). When Edith and fellow residents begin to receive wicked letters full of unintentionally hilarious profanities, foulmouthed Rose is charged with the crime. The anonymous letters prompt a national uproar, and a trial ensues. However, as the town's women - led by Police Officer Gladys Moss (Anjana Vasan) - begin to investigate the crime themselves, they suspect that something is amiss, and Rose may not be the culprit after all.",
            runTime = 100,
            seatsRemaining = Random.nextInt(0..15),
            seatsSelected =1
        ),
    )
}


