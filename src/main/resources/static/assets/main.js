// Polymer Button Clicks

document.addEventListener('WebComponentsReady', function () {

    var rippler = document.getElementById('rippler');
    var scope = document.querySelector('#app');

    scope.dataReceived = function () {
        console.log('Response data was received.');
    };

    scope._onPolymerClick = function () {
        this.$.list.sharedElements = {
            'ripple': rippler,
            'reverse-ripple': rippler
        };
        $("paper-tab").fadeOut();
        this.$.pages.selected = 'post-detail';
    };

    scope._onBackClick = function () {
        $("paper-tab").fadeIn();
        this.$.list.sharedElements = {
            'ripple': rippler,
            'reverse-ripple': rippler
        };
        this.$.pages.selected = 'posts';
    }
});

// Search

var search = document.querySelector('.search');
var searchField = document.querySelector('.search-field');
var sort = document.querySelector('#sort');
var searchFilled = 'search-filled';

if (searchField.value.trim() !== '') {
    searchField.parentNode.classList.add(searchFilled);
}

search.addEventListener('submit', function(evt) {
    evt.preventDefault();

    var value = evt.target[0].value;
    window.location = window.location.origin + '/search/' + value;
});

searchField.addEventListener('focus', function(evt) {
    searchField.parentNode.classList.add(searchFilled);
});

searchField.addEventListener('blur', function(evt) {
    if (evt.target.value.trim() === '') {
        searchField.parentNode.classList.remove(searchFilled);
    }
});