package com.example.simplepost

import com.google.gson.annotations.SerializedName


class People {

    var data: List<PeopleDetailed>? = null

    class PeopleDetailed {

        @SerializedName("name")
        var name: String? = null

        constructor(name: String?) {
            this.name = name

        }

    }
}