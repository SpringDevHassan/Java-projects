document.addEventListener('DOMContentLoaded', function () {
    // Define the properties array with images and links
//     const properties = [
//         { 
//             location: "Patna", 
//             cost: "50,00,000 INR", 
//             description: "3 BHK Apartment in Patna", 
//             imageUrl: "D:\realstateweb\img", 
//             link: "https://example.com/property/patnaD:\realstateweb\img" 
//         },
//         { 
//             location: "Gaya", 
//             cost: "30,00,000 INR", 
//             description: "2 BHK House in Gaya", 
//             imageUrl: "path/to/image2.jpg", 
//             link: "https://example.com/property/gaya" 
//         },
//         { 
//             location: "Bhagalpur", 
//             cost: "25,00,000 INR", 
//             description: "2 BHK Flat in Bhagalpur", 
//             imageUrl: "path/to/image3.jpg", 
//             link: "https://example.com/property/bhagalpur" 
//         },
//         { 
//             location: "Muzaffarpur", 
//             cost: "35,00,000 INR", 
//             description: "3 BHK Villa in Muzaffarpur", 
//             imageUrl: "path/to/image4.jpg", 
//             link: "https://example.com/property/muzaffarpur" 
//         },
//         { 
//             location: "Darbhanga", 
//             cost: "20,00,000 INR", 
//             description: "1 BHK Apartment in Darbhanga", 
//             imageUrl: "path/to/image5.jpg", 
//             link: "https://example.com/property/darbhanga" 
//         }
//     ];

//     // Get the element where property cards will be inserted
//     const propertyList = document.getElementById('propertyList');

//     // Iterate through properties and create HTML for each card
//     properties.forEach(property => {
//         const propertyCard = document.createElement('div');
//         propertyCard.classList.add('property-card', 'col-md-4');

//         propertyCard.innerHTML = `
//             <a href="${property.link}" target="_blank">
//                 <img src="${property.imageUrl}" alt="${property.location}" class="img-fluid">
//                 <div class="property-info">
//                     <h3>${property.location}</h3>
//                     <p>Cost: ${property.cost}</p>
//                     <p>${property.description}</p>
//                 </div>
//             </a>
//         `;

//         // Append the card to the property list
//         propertyList.appendChild(propertyCard);
//     });
// });
document.addEventListener('DOMContentLoaded', () => {
    fetch('/api/properties')
    .then(response => response.json())
    .then(properties => {
        const propertyList = document.getElementById('property-list');
        properties.forEach(property => {
            const listItem = document.createElement('li');
            listItem.textContent = `Location: ${property.location}, Cost: ${property.cost}`;
            propertyList.appendChild(listItem);
        });
    })
    .catch(error => console.error('Error fetching properties:', error));
});





